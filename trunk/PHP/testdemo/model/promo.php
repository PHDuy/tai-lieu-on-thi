<?php
class Promo extends Db {

    public $table_name = "partners";

    public function __construct() {
        parent::__construct();
    }
    public function select($params) {
        /**
         * TODO: Write your code here
         */
        $query = "SELECT * FROM {$this->table_name}";//SQL query
        //die($query);
        $data = parent::select($query);
        return $data;
    }
    
    public function get_row_by_id($id) {
        $data=parent::get_row_by_id($id);
        return $data;
    }
    public function isExisted_id($id)
    {
        $query = "SELECT * FROM {$this->table_name} WHERE id=".$id;//SQL query
        //die($query);
        $data = parent::select($query);
        if (!empty($data[0]['id']))return (int) $data[0]['id'];
        //var_dump($query);
        return NULL;
    }
    
    public function count($params) {
        /**
         * TODO: Write your code here
         */
        $query = "SELECT COUNT(*) AS COUNT FROM {$this->table_name}";
        $data = parent::select($query);
        if (!empty($data[0]['COUNT']))return (int) $data[0]['COUNT'];
        //var_dump($query);
        return 0;
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
    
    public function total_partner($params=NULL) {
        /**
         * TODO: Write your code here
         */
        $query = "SELECT COUNT(*) AS COUNT FROM {$this->_table}";//SQL query
        $data = parent::select($query);
        return $data;
    }

}
