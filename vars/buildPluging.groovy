def call(Map hostMap) {
	echo "************ ************* Build ***************************** "
	hostMap.putAt("BBB","bbbb")
	echo hostMap["AAA"]
	echo hostMap["BBB"]
	echo "*********************************************************"
}
