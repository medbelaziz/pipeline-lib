def call() {
      input {
            message "Should we continue?"
            ok "Continue"
      }
      steps {
            echo "Hello, nice to meet you."
      }
}
