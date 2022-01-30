FROM jboss/wildfly:latest
ADD customization /opt/jboss/wildfly/customization/
EXPOSE 8080 9990
CMD ["/opt/jboss/wildfly/customization/execute.sh"]