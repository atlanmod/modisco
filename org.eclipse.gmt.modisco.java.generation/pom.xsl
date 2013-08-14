<?xml version="1.0" encoding="UTF-8"?>
<!-- Copyright (c) 2012 Mia-Software. -->
<!-- All rights reserved. -->
<!-- This program and the accompanying materials are made available under 
	the terms of the Eclipse Public License v1.0 which accompanies this distribution, 
	and is available at http://www.eclipse.org/legal/epl-v10.html -->
<!-- Contributors: -->
<!-- Grégoire Dupé (Mia-Software) - Bug 413749 - Missing GenerateJava.emtl file in modisco java generator plugin -->
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:exsl="http://exslt.org/common"
	extension-element-prefixes="exsl" xmlns:m2="http://maven.apache.org/POM/4.0.0"
	xmlns="http://maven.apache.org/POM/4.0.0">
	<xsl:output indent="yes" />

	<xsl:template match="/">
		
		<project
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
			xmlns="http://maven.apache.org/POM/4.0.0"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<xsl:apply-templates select="//m2:project/*[name()!='build']" />
			<properties>
				<uml-to-java-site>http://marketplace.obeonetwork.com/updates/od5/</uml-to-java-site>
				<eclipse-site>http://download.eclipse.org/releases/indigo</eclipse-site>
				<platform-version>[3.7,3.8)</platform-version>
			</properties>
			<repositories>
				<repository>
					<id>eclipse-platform</id>
					<layout>p2</layout>
					<url>${eclipse-site}</url>
				</repository>
				<repository>
					<id>uml-to-java</id>
					<layout>p2</layout>
					<url>${uml-to-java-site}</url>
				</repository>
				<repository>
					<id>Indigo Release</id>
					<url>https://raw.github.com/eclipse/acceleo/master/maven/repository/releases/indigo</url>
				</repository>
				<repository>
					<id>Juno Release</id>
					<url>https://raw.github.com/eclipse/acceleo/master/maven/repository/releases/juno</url>
				</repository>
				<repository>
					<id>Snapshots</id>
					<url>https://raw.github.com/eclipse/acceleo/master/maven/repository/snapshots</url>
				</repository>
			</repositories>
			
			<pluginRepositories>
				<pluginRepository>
					<id>codehaus.snapshots</id>
					<url>http://snapshots.repository.codehaus.org/</url>
				</pluginRepository>
				<pluginRepository>
					<id>Indigo Release</id>
					<url>https://raw.github.com/eclipse/acceleo/master/maven/repository/releases/indigo</url>
				</pluginRepository>
				<pluginRepository>
					<id>Juno Release</id>
					<url>https://raw.github.com/eclipse/acceleo/master/maven/repository/releases/juno</url>
				</pluginRepository>
				<pluginRepository>
					<id>Snapshots</id>
					<url>https://raw.github.com/eclipse/acceleo/master/maven/repository/snapshots</url>
				</pluginRepository>
			</pluginRepositories>
			
			<dependencies>
				<dependency>
					<groupId>org.eclipse.acceleo</groupId>
					<artifactId>maven</artifactId>
					<version>3.2.1</version>
				</dependency>
				<dependency>
					<groupId>org.eclipse.acceleo</groupId>
					<artifactId>engine</artifactId>
					<version>3.2.1</version>
				</dependency>
				<dependency>
					<groupId>org.slf4j</groupId>
					<artifactId>slf4j-simple</artifactId>
					<version>1.6.4</version>
				</dependency>
			</dependencies>
			
			<build>
				<plugins>
					<xsl:copy-of select="//m2:project/build/plugins/*"/>
					<plugin>
						<groupId>org.eclipse.acceleo</groupId>
						<artifactId>maven</artifactId>
						<version>3.2.1</version>
						<executions>
							<execution>
								<goals>
									<goal>acceleo-compile</goal>
								</goals>
								<phase>compile</phase>
							</execution>
						</executions>
						<configuration>
							<useBinaryResources>false</useBinaryResources>
							<usePlatformResourcePath>true</usePlatformResourcePath>
							<acceleoProject>
							<root>${basedir}</root>
							<entries>
								<entry>
									<input>src/</input>
									<output>__target__/classes</output>
								</entry>
							</entries>
							<jars>
								<jar>p2.eclipse-plugin:org.obeonetwork.pim.uml2.gen.java</jar>
							</jars>
							</acceleoProject>
							<packagesToRegister>
								<packageToRegister>org.eclipse.gmt.modisco.java.emf.JavaPackage</packageToRegister>
							</packagesToRegister>
							<uriHandler>org.eclipse.acceleo.maven.AcceleoURIHandler</uriHandler>
						</configuration>
					</plugin>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-resources-plugin</artifactId>
						<version>2.4.1</version>
						<configuration>
							<encoding>ISO-8859-1</encoding>
						</configuration>
					</plugin>
				</plugins>
				<xsl:copy-of select="//m2:project/build/*[name()!='plugins']"/>
			</build>
		</project>
	</xsl:template>

	<xsl:template match="m2:*|@*">
		<xsl:copy-of select="." />
	</xsl:template>

</xsl:stylesheet>
