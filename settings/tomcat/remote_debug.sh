set JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=57020,suspend=n,server=y
-Djava.security.egd=file:/dev/./urandom
tail -f /home/app/tomcat/logs/catalina.out

set "JAVA_OPTS=%JAVA_OPTS% -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=8050 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false"

