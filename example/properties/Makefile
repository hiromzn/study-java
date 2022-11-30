
ReadPropertiesSample.class : ReadPropertiesSample.java
	javac $<

run : ReadPropertiesSample.class
	for f in *.properties; do
	java $< $f >$f.out
	done
