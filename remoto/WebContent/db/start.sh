WEBCONTENT=/home/renato/Documents/ReMoto/remoto2/remoto/WebContent

java -cp $WEBCONTENT/WEB-INF/lib/hsqldb.jar org.hsqldb.Server -database.0 file:$WEBCONTENT/db/remoto -dbname.0 remoto
