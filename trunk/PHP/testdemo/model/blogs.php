<?php

class Blogs extends Db {

    public $table_name = "blog";

    public function __construct() {
        parent::__construct();
    }

    public function select($params) {
        /**
         * TODO: Write your code here
         */
        $query = "SELECT * FROM {$this->table_name} ORDER BY {$this->table_name}.CREATED DESC";
        if (!empty($params['offset'])) {
            $offset = ($params['offset'] - 1)*PER_PAGE;
            $query .= ' LIMIT '.$offset.', '.PER_PAGE;
       } 
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
    
    public function count(){
    $query = "SELECT COUNT(*) AS COUNT FROM {$this->table_name} ";
    $data = parent::select($query);
    if (!empty($data[0]['COUNT'])) return (int)$data[0]['COUNT'];
        return 0;
}
    
    public function GetAuthorBlog($params) {
        /**
         * TODO: Write your code here
         */
        $table_name1 = 'authors';
        $query = "SELECT {$this->table_name}.id, {$this->table_name}.name, {$this->table_name}.created, {$table_name1}.name AS nameAuthor "
        . "FROM {$this->table_name} LEFT JOIN {$table_name1} "
        . "ON {$this->table_name}.id_author = {$table_name1}.id "
        . "ORDER BY {$this->table_name}.CREATED DESC";//SQL query
        
        if(!empty($params['limit'])){
           $query .= ' LIMIT '. $params['limit'];
       } 
       
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
