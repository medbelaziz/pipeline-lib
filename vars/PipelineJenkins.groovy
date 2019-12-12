#!/usr/bin/groovy
package com.orange

class PipelineJenkins extends PipelineTrait{

	PipelineJenkins(){
		this.prepare()
		this.build()
	}
	
}
