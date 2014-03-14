<?php
mysql_connect("localhost","root","12345");
@mysql_select_db("trade") or die("unable to select database");
$query=mysql_query("select  distinct *  from hs4");
while($row=mysql_fetch_array($query))
{$field1=$row['hs4_no'];
$field2=$row['hs4_des'];
$field3=(int)($field1/100);

mysql_query("insert into `new_hs4` values('$field1','$field2','$field3')");
echo $field1;
echo "<br>";
echo $field2;
echo "<br>";
echo $field3;
echo "<br>";
}
?>
