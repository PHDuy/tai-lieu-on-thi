<?php

class Db {

    public static $connection;
    public $table_name;
    public function __construct() {
        $this->connect();
    }

    /**
     * Create conection
     * @return type
     */
    private function connect() {
        if (self::$connection) {
            return self::$connection;
        } else {
            self::$connection = mysql_connect(DB_HOST, DB_USER, DB_PASS);
            mysql_query("set names 'utf8'");
            mysql_select_db(DB_NAME, self::$connection);
            return self::$connection;
        }
    }
    public function get_row_by_id($id) {
        $query = 'SELECT * FROM '.$this->table_name. ' WHERE id='.$id;//SQL query
        if (empty(self::$connection)) {return NULL;}
        $ret = mysql_query($query, self::$connection);
        //var_dump($query);
        $data = array();
        while ($row = mysql_fetch_assoc($ret)) {
            $data[] = $row;
        }
        if (!empty($data)) {return $data[0];}
        return $data;
    }

    /**
     * Select record
     * @param type $query
     * @return type
     */
    function select($query) {
        if (empty(self::$connection)) return NULL;
        $ret = mysql_query($query, self::$connection);
        $data = array();
        while ($row = mysql_fetch_assoc($ret)) {
            $data[] = $row;
        }
        return $data;
    }
    
    /**
     * Insert record
     * @param type $query
     * @return type
     */
    function insert($query) {
        if (empty(self::$connection)) return NULL;
        $ret = mysql_query($query, self::$connection);
        if ($ret) {
            return mysql_insert_id();
        } else {
            return NULL;
        }
        
    }
    
    /**
     * Update record
     * @param type $query
     * @return type
     */
    function update($query) {
        if (empty(self::$connection)) return NULL;
        $ret = mysql_query($query, self::$connection);
        return $ret;
    }
    
    /**
     * Delete record
     * @param type $query
     * @return type
     */
    function delete($query) {
        if (empty(self::$connection)) return NULL;
        $ret = mysql_query($query, self::$connection);
        return $ret;
    }
}
