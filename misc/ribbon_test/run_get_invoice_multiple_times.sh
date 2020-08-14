max=500
for i in `seq 1 $max`
do
    echo $i
    curl --location --request GET 'http://localhost:8083/fatura/1/1'
    sleep 1
    echo '\n'
done