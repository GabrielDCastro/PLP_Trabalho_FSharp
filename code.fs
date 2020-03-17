type Details = {
    Name: string
    Desription: string 
}
type Item= {
    Details: Details
}

type Exit =
    | PassableExit of Details * destination: Room
    | LockedExit of Details * key: Item * next: Exit
    | NoExit of Details option 

and Exits= {
    North: Exit
    South: Exit
    East: Exit
    West: Exit
}
and Room = {
    Details: Details 
    Item: Item list
    Exits: Exits
}

let firstRoom = 
    { Details = { Name = "First Room"; Desription = "Você esta em pé em uma sala"};
        Item = [];
        Exits = 
            {
            North = NoExit(None);
            South = NoExit(None);
            West = NoExit(None);
            East = NoExit(None) }
            }
