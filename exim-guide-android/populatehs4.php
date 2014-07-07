<?php
mysql_connect("localhost","root","12345");
@mysql_select_db("trade") or die("unable to select database");
$query=mysql_query("select distinct hs4_no,hs4_des from hs4");
while($row=mysql_fetch_array($query))
{
$field1=$row['hs4_no'];
$field2=$row['hs4_des'];
$field3=(int)($row['hs4_no']/100);
mysql_query("insert into  newhs4 values('$field1','$field2','$field3')");
echo $field1;
echo "<br>";
echo $field2;

echo "<br>";
echo $field2;
echo "<br>";
}
?>
