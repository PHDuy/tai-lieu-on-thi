<?php

include_once 'db.php';

class Categories extends Db {

    public $table_name = "categories";

    public function __construct() {
        parent::__construct();
    }

    public function select($params) {
        /**
         * TODO: Write your code here
         */
        $query = "SELECT * FROM {$this->table_name} WHERE id = ".$params['id_category'];
        //var_dump($query);
        $data = parent::select($query);
        return $data;
    }
    
    public function insert($params) {
        /**
         * TODO: Write your code here
         */
        $query = '';//SQL query
        $data = parent::insert($query);
        return $data;
    }
    public function update($params) {
        /**
         * TODO: Write your code here
         */
        $query = '';//SQL query
        $data = parent::update($query);
        return $data;
    }
    public function delete($params) {
        /**
         * TODO: Write your code here
         */
        $query = '';//SQL query
        $data = parent::delete($query);
        return $data;
    }

}
