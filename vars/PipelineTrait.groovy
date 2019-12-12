#!/usr/bin/groovy

abstract class PipelineTrait implements PipelineInterface {

	@Override
	@NonCPS
	public void prepare() {
		def stageName = "Prepare"
		this.logStart(stageName)
		this.prepare()
		this.logEnd(stageName)
	}

	@Override
	@NonCPS
	public void build() {
		def stageName = "Build"
		this.logStart(stageName)
		this.build()
		this.logEnd(stageName)
	}

	@Override
	@NonCPS
	public void logStart(String stageName) {
		echo ">>> logStart ***********************"
		echo ">>> "+stageName
	}

	@Override
	@NonCPS
	public void logEnd(String stageName) {
		echo "<<< "+stageName
		echo "<<< logEnd ***********************"
	}
}
