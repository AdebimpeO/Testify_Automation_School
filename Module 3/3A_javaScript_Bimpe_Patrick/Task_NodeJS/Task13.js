//My Personal Library 2

const books = {
    title: "The Journey to the Top",
    description: "A motivational book",
    numberOfPages: 450,
    author: "John Joe",
    reading: true,
    toggleReadingStatus: function(){
        if(books.reading===true){
            books.reading = false
        } else {
            books.reading = true
        }
    }
}

books.toggleReadingStatus()
console.log(books.reading)
