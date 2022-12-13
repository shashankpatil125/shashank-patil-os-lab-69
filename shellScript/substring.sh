
echo "String = $1"
echo "Sub-string = $2"
echo $1 | grep -o "$2" | wc -l

echo "qwertyer er" | grep -o er | wc -l