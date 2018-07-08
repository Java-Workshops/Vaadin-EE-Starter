FROM svenruppert/jdk-openjdk-10:1.10.1
LABEL maintainer="Sven Ruppert sven.ruppert@gmail.com" description="Glassfish v5 release image"

ENV GLASSFISH_ARCHIVE glassfish5
ENV DOMAIN_NAME domain1
ENV INSTALL_DIR /opt
ENV GLASSFISH_HOME ${INSTALL_DIR}/${GLASSFISH_ARCHIVE}

RUN useradd -b /opt -m -s /bin/sh -d ${INSTALL_DIR} serveradmin && echo serveradmin:serveradmin | chpasswd

RUN curl -o ${INSTALL_DIR}/${GLASSFISH_ARCHIVE}.zip -L http://download.oracle.com/glassfish/5.0/release/glassfish-5.0.zip \
    && cd ${INSTALL_DIR} \
    && jar xvf ${GLASSFISH_ARCHIVE}.zip \
    && rm ${GLASSFISH_ARCHIVE}.zip \
    && chown -R serveradmin:serveradmin /opt \
    && chmod -R a+rw /opt \
    && chmod 777 ${GLASSFISH_HOME}/bin/asadmin

#ENV GLASSFISH_HOME ${INSTALL_DIR}/${GLASSFISH_ARCHIVE}/glassfish

ENV DEPLOYMENT_DIR ${GLASSFISH_HOME}/domains/domain1/autodeploy

WORKDIR ${GLASSFISH_HOME}/bin

ENTRYPOINT ${GLASSFISH_HOME}/bin/asadmin start-domain --verbose ${DOMAIN_NAME}

USER serveradmin
EXPOSE 4848 8009 8080 8181