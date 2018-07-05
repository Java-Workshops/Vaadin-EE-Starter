FROM svenruppert/jdk-openjdk-10:1.10.1
LABEL maintainer="Sven Ruppert sven.ruppert@gmail.com" description="Java EE7 Full & Web Distribution"

ENV VERSION 13.0.0.Final
ENV INSTALL_DIR /opt
ENV WILDFLY_HOME ${INSTALL_DIR}/wildfly-${VERSION}
ENV DEPLOYMENT_DIR ${WILDFLY_HOME}/standalone/deployments/
ENV CONFIGURATION_DIR ${WILDFLY_HOME}/standalone/configuration

RUN useradd -b /opt -m -s /bin/sh -d ${INSTALL_DIR} serveradmin && echo serveradmin:serveradmin | chpasswd

RUN curl -O https://download.jboss.org/wildfly/${VERSION}/wildfly-${VERSION}.tar.gz \
    && tar -xzf wildfly-${VERSION}.tar.gz  \
    && mv wildfly-${VERSION} ${INSTALL_DIR} \
    && rm wildfly-${VERSION}.tar.gz \
    && chown -R serveradmin:serveradmin /opt \
    && chmod a+x ${WILDFLY_HOME}/bin/standalone.sh \
    && chmod -R a+rw ${INSTALL_DIR}

USER serveradmin

ENTRYPOINT ${WILDFLY_HOME}/bin/standalone.sh -b=0.0.0.0
EXPOSE 8080