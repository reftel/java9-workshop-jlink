mvn clean install
rm -rf libs
mkdir libs
rm -rf image
cp api/target/jlink-api-1.0-SNAPSHOT.jar libs/
cp app/target/jlink-app-1.0-SNAPSHOT.jar libs/
jlink --module-path "/c/java/jdk-10/jmods/;libs" --add-modules no.hamre.java9workshop.jlink.api,no.hamre.java9workshop.jlink.app --output image/
./image/bin/java -m no.hamre.java9workshop.jlink.app/no.hamre.java9workshop.jlink.app.Main
