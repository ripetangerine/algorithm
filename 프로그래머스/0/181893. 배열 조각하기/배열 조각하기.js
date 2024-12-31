function solution(arr, query) {
    var answer = [];
    
    for(let i=0; i<query.length; i++){
        if(i%2===0){
            arr.splice(query[i]+1, arr.length - (query[i]+1));
            
        }else{
            arr.splice(0, query[i]);
        }
    }
    
    return arr;
}