#!/usr/bin/groovy

class PipelineJenkins extends PipelineTrait{

	PipelineJenkins(){
		this.prepare()
		this.build()
	}
	
}
