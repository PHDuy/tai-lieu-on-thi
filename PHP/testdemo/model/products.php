<?php

include_once 'db.php';

class Products extends Db {

    public $table_name = "products";

    public function __construct() {
        parent::__construct();
    }

    public function select($params) {
        /**
         * TODO: Write your code here
         */
        $query = "SELECT * FROM {$this->table_name} ";
        
       if(!empty($params['id_category'])){
           $query .= ' WHERE id_category='.$params['id_category'];
       }
       
       if(!empty($params['search']))
       {
           $query .=" WHERE name LIKE '%{$params['search']}%'";
       }
       
       if (!empty($params['offset'])) {
            $offset = ($params['offset'] - 1)*PER_PAGE;
            $query .= ' LIMIT '.$offset.', '.PER_PAGE;
       } 
       
       if(!empty($params['limit'])){
           $query .= ' LIMIT '. $params['limit'];
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
    
public function count($params){
    $query = "SELECT COUNT(*) AS COUNT FROM {$this->table_name} ";
    if(!empty($params['id_category'])){
           $query .= ' WHERE id_category='.$params['id_category'];
       }
    if(!empty($params['search'])){
        $query .=" WHERE name LIKE '%{$params['search']}%'";
    }
    $data = parent::select($query);
    if (!empty($data[0]['COUNT'])) return (int)$data[0]['COUNT'];
    //var_dump($data);
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

}
