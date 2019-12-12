#!/usr/bin/groovy
package com.orange

class PipelineTrait {


	static void prepare() {
		def stageName = "Prepare"
		this.logStart(stageName)
		this.logEnd(stageName)
	}


	static public void build() {
		def stageName = "Build"
		this.logStart(stageName)
		this.logEnd(stageName)
	}


	static  void logStart(String stageName) {
		echo ">>> logStart ***********************"
		echo ">>> "+stageName
	}


	static void logEnd(String stageName) {
		echo "<<< "+stageName
		echo "<<< logEnd ***********************"
	}
}
