
exe=ReadPropertiesSample

for f in *.properties; do
	java $exe $f >$f.out
done
