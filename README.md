# MoDisco
Model Discover


## Local build

```sh
git clone git@github.com:atlanmod/modisco.git org.eclipse.modisco.build
sh -xe org.eclipse.modisco.build/org.eclipse.modisco.releng.tycho/releasetrain/build.sh
```

```sh

export WORKSPACE=$(pwd)
export MAVEN_OPTS="-XX:PermSize=256m -XX:MaxPermSize=512m"
export SVN_REVISION_1="1.2.0"

mvn -f ${WORKSPACE}/org.eclipse.modisco.build/org.eclipse.emf.facet.releng/org.eclipse.emf.facet.releng.tycho.util/pom.xml -DSKIP_TESTS=false -DSIGN_UPDATE_SITE=true -DSKIP_QUALITY_ANALYSIS=false -Dorg.eclipse.emf.facet.releng.tycho.util.configure.parentArtifact=org.eclipse.modisco.build -Dorg.eclipse.emf.facet.releng.tycho.util.configure.productRevision=${SVN_REVISION_1} -Dorg.eclipse.emf.facet.releng.tycho.util.configure.generateDependencies.aggrDir=${WORKSPACE}/org.eclipse.simrel.build -Dorg.eclipse.emf.facet.releng.tycho.util.configure.relengProperties=${WORKSPACE}/org.eclipse.modisco.build/org.eclipse.modisco.releng.tycho/releasetrain/releng.properties -DWORKSPACE=${WORKSPACE}  compile -e -U -Ppom-configure  


mvn -f ${WORKSPACE}/org.eclipse.modisco.build/pom.xml -DSKIP_TESTS=false -DSIGN_UPDATE_SITE=true -DSKIP_QUALITY_ANALYSIS=false -Dproduct.signing.directory=/home/data/httpd/download-staging.priv/modeling/mdt/modisco/signingN -DcontinueOnFail=true -Declipse.p2.mirrors=false verify -e

mvn -f ${WORKSPACE}/org.eclipse.emf.facet.releng/org.eclipse.emf.facet.releng.tycho.util/pom.xml -DSKIP_TESTS=false -DSIGN_UPDATE_SITE=true -DSKIP_QUALITY_ANALYSIS=false process-resources -e -P pom-finalize
```

## Clean up

```sh
echo Cleaning the workspace
find $WORKSPACE -mindepth 3 -name __target__ -exec rm -rf {} \; -depth
rm -rf releng/__target__
rm -rf org.eclipse.modisco.releasetrain/org.*
if [ -e .maven ] ; then
	rm -rfv .maven
fi
echo Cleaning finished
```