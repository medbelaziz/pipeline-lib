
import static com.orange.PipelineJenkins.exec

def call() {
	println "******** debut ********"
	exec()
	println "******** FIN ********"
	
	input {
            message "Should we continue?"
            ok "Continue"
      }
      steps {
            echo "Hello, nice to meet you."
      }

}
