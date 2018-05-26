const users = [
  {
    id: 1,
    username: 'pepe',
    fullName: "pepe",
    email: "pepe@pepe,com",
  },{
    id: 2,
    username: 'lara',
    fullName: "lara",
    email: "lara@pepe,com",
  }
]

const firstPublication = {
  id: 1,
  title: 'Busqueda en UNQ',
  introduction: 'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',
  description: `Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500 s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.It was popularised in the 1960 s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.`,
  company: 'UNQ',
  user: users[0],
  chats: [
    {
      user: users[1],
      text: 'There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour'
    },
    {
      user: users[0],
      text: 'There are many variations of passages of Lorem Ipsum available, by injected humour'
    },
  ]
}

const secondPublication = {
  id: 2,
  title: 'Busqueda en UNLP',
  introduction: 'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',
  description: `Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500 s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.It was popularised in the 1960 s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.`,
  company: 'UNQ',
  user: users[0],
  chats: [{
      user: users[1],
      text: 'There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour'
    },
    {
      user: users[0],
      text: 'There are many variations of passages of Lorem Ipsum available, by injected humour'
    },
  ]
}

const thirdPublication = {
  id: 3,
  title: 'Busqueda en LALA',
  introduction: 'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...',
  description: `Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500 s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.It was popularised in the 1960 s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.`,
  company: 'UNQ',
  user: users[0],
  chats: [{
      user: users[1],
      text: 'There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour'
    },
    {
      user: users[0],
      text: 'There are many variations of passages of Lorem Ipsum available, by injected humour'
    },
  ]
}



const publications = [firstPublication, secondPublication, thirdPublication, thirdPublication, thirdPublication, thirdPublication]

module.exports= publications;