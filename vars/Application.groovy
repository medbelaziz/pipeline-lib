
import static com.orange.PipelineJenkins.exec

def call() {
	println "******** debut ********"
	exec()
	println "******** FIN ********"

	input 'continue to deploy'

	echo "Hello, nice to meet you."
      

}
