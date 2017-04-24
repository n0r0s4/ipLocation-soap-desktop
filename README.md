# ipLocation-soap-desktop
*Es un cliente SOAP de escritorio hecho con maven.

*Se puede ejecutar de dos maneras:

-fácil: desde netbeans/eclipse, click derecho en el proyecto, propiedades, y en el run, le pasas como argumento la ip que quieras y te saldrá en el netbeans/eclipse su origen.


-serio: desde linea de comandos una vez compilado, y en la carpeta rutaDeTusProyectos\clientSOAP\target\classes ejecutas (como ya sabéis por convención maven mete ahí los compilados):

** java com.mseven.clientsoap.IpLocation <ipquequieras> **


											
java com.mseven.clientsoap.IpLocation 203.11.116.3
java com.mseven.clientsoap.IpLocation 205.215.127.52
java com.mseven.clientsoap.IpLocation 12.161.160.112
java com.mseven.clientsoap.IpLocation 207.239.41.88
java com.mseven.clientsoap.IpLocation 36.6.102.84
java com.mseven.clientsoap.IpLocation 236.218.2.11	
java com.mseven.clientsoap.IpLocation 56.32.76.252


