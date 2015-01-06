<?php

class Functions{
    
    function truncateString_($str, $len, $charset="UTF-8"){ //Ham cat chuoi.
        $str = html_entity_decode($str, ENT_QUOTES, $charset);   
        if(mb_strlen($str, $charset)> $len){
            $arr = explode(' ', $str);
            $str = mb_substr($str, 0, $len, $charset);
            $arrRes = explode(' ', $str);
            $last = $arr[count($arrRes)-1];
            unset($arr);
            if(strcasecmp($arrRes[count($arrRes)-1], $last))   unset($arrRes[count($arrRes)-1]);
          return implode(' ', $arrRes)."...";   
       }
        return $str;
    }
    function error404(){print '<script type="text/javascript">location.href = "warning.php";</script>';    }
    
}
    