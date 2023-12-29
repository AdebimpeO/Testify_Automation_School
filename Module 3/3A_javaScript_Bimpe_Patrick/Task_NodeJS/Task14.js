//My Personal library 3

const books = [
    { title: "The Journey to the Top",
    description: "A motivational book",
    numberOfPages: 450,
    author: "John Joe",
    reading: true,

    },
    {
        title: "If wishes were horses",
        description: "A Wish Book",
        numberOfPages: 100,
        author: "Doe Peter",
        reading: false,
    },
    {
        title: "Taxi",
        description: "Short Story",
        numberOfPages: 210,
        author: "Rowland Mark",
        reading: false,
    },
    {
        title: "Trials of Brother Jero",
        description: "Poetry",
        numberOfPages: 200,
        author: "Wole Shoyinka",
        reading: false,
    },
    {
        title: "End Time Series",
        description: "Religious book",
        numberOfPages: 1500,
        author: "Tim Lahaye",
        reading: True,
    }
]
const filter = books.filter(function (books){
    return books.reading === true;
});
console.log(filter);