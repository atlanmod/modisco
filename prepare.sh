#!/bin/sh

cd tmp
# EMF Facet

if [ ! -e org.eclipse.emf.facet.util.emf.core.jar ]; then
	wget http://download.eclipse.org/facet/updates/release/1.3.0/plugins/org.eclipse.emf.facet.util.emf.core_1.3.0.201805181509.jar --output-document=org.eclipse.emf.facet.util.emf.core.jar
fi

mvn install:install-file -Dfile=org.eclipse.emf.facet.util.emf.core.jar -DgroupId=org.eclipse.emf.facet \
-DartifactId=org.eclipse.emf.facet.util.emf.core -Dversion=1.3.0 -Dpackaging=jar

if [ ! -e org.eclipse.emf.facet.util.emf.catalog.jar ]; then
	wget http://download.eclipse.org/facet/updates/release/1.3.0/plugins/org.eclipse.emf.facet.util.emf.catalog_1.3.0.201805181509.jar --output-document=org.eclipse.emf.facet.util.emf.catalog.jar
fi

mvn install:install-file -Dfile=org.eclipse.emf.facet.util.emf.catalog.jar -DgroupId=org.eclipse.emf.facet \
-DartifactId=org.eclipse.emf.facet.util.emf.catalog -Dversion=1.3.0 -Dpackaging=jar

if [ ! -e org.eclipse.emf.facet.util.core.jar ]; then
	wget http://download.eclipse.org/facet/updates/release/1.3.0/plugins/org.eclipse.emf.facet.util.core_1.3.0.201805181509.jar --output-document=org.eclipse.emf.facet.util.core.jar
fi

mvn install:install-file -Dfile=org.eclipse.emf.facet.util.core.jar -DgroupId=org.eclipse.emf.facet \
-DartifactId=org.eclipse.emf.facet.util.core -Dversion=1.3.0 -Dpackaging=jar

#EMF Validation

if [ ! -e org.eclipse.emf.validation ]; then
	git clone git://git.eclipse.org/gitroot/emf-validation/org.eclipse.emf.validation.git  --depth 1 --branch R1_12_1 --single-branch
fi

cd org.eclipse.emf.validation
mvn -f org.eclipse.emf.validation.releng/pom.xml -DskipTests clean package
mvn install:install-file -Dfile=./org.eclipse.emf.validation/target/org.eclipse.emf.validation-1.8.0-SNAPSHOT.jar \
-DgroupId=org.eclipse.emf \
-DartifactId=org.eclipse.emf.validation -Dversion=1.12.0 -Dpackaging=jar
cd ..

#EMF Transaction
if [ ! -e org.eclipse.emf.transaction ]; then
	git clone git://git.eclipse.org/gitroot/emf-transaction/org.eclipse.emf.transaction.git  --depth 1 --branch R1_12_0M7 --single-branch
fi
cd org.eclipse.emf.transaction
mvn -f org.eclipse.emf.transaction.releng/pom.xml -DskipTests clean package
mvn install:install-file -Dfile=./org.eclipse.emf.transaction/target/org.eclipse.emf.transaction-1.9.1-SNAPSHOT.jar \
-DgroupId=org.eclipse.emf \
-DartifactId=org.eclipse.emf.transaction -Dversion=1.12.0 -Dpackaging=jar
cd ..

# OCL

if [ ! -e org.eclipse.ocl.ecore.jar ]; then
	wget http://download.eclipse.org/modeling/mdt/ocl/updates/releases/6.9.0/plugins/org.eclipse.ocl.ecore_3.14.0.v20190910-0937.jar --output-document=org.eclipse.ocl.ecore.jar
fi

mvn install:install-file -Dfile=org.eclipse.ocl.ecore.jar -DgroupId=org.eclipse.ocl -DartifactId=org.eclipse.ocl.ecore -Dversion=3.14.0 -Dpackaging=jar

if [ ! -e org.eclipse.ocl.jar ]; then
	wget http://download.eclipse.org/modeling/mdt/ocl/updates/releases/6.9.0/plugins/org.eclipse.ocl_3.10.400.v20190910-0937.jar --output-document=org.eclipse.ocl.jar
fi
mvn install:install-file -Dfile=org.eclipse.ocl.jar -DgroupId=org.eclipse.ocl -DartifactId=org.eclipse.ocl -Dversion=3.14.0 -Dpackaging=jar

cd ..

