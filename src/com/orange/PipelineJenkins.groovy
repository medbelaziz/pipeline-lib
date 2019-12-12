#!/usr/bin/groovy
package com.orange

class PipelineJenkins extends PipelineTrait{

	PipelineJenkins(){

	}
	static def exec() {
		this.prepare()
		this.build()
	}
}
