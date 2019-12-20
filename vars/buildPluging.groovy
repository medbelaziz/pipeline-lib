import org.jenkinsci.plugins.pipeline.modeldefinition.Utils
def call(Map hostMap) {
      Utils.markStageSkippedForConditional(STAGE_NAME)
}
