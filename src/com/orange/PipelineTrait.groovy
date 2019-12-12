#!/usr/bin/groovy
package com.orange

class PipelineTrait {


	static void prepare() {
		def stageName = "Prepare"
		this.logStart(stageName)
		this.logEnd(stageName)
	}


	static def  build() {
		def stageName = "Build"
		this.logStart(stageName)
		this.logEnd(stageName)
	}


	static def  logStart( stageName) {
		println ">>> logStart ***********************"
		println ">>> "+stageName
	}


	static def logEnd(String stageName) {
		println "<<< "+stageName
		println "<<< logEnd ***********************"
	}
}
