<?php
mysql_connect("localhost","root","12345");
@mysql_select_db("trade_new") or die("unable to select database");
$query=mysql_query("select  itc, hs8, policy, conditions  from master");
while($row=mysql_fetch_array($query))
{$field1=$row['itc'];
$field2=$row['hs8'];
$field3=(int)($field1/100);
$field4=$row['policy'];
$field5=$row['conditions'];
mysql_query("insert into `hs8` values('$field1','$field2','$field3','$field4','$field5')");
echo $field1;
echo "<br>";
echo $field2;
echo "<br>";
echo $field3;
echo "<br>";
echo $field4;
echo "<br>";
echo $field5;
echo "<br>";
}
?>