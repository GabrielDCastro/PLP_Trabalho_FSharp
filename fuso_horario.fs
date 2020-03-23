open System
[<EntryPoint>]
let main argv = 

    // Isso coloca todos os fusos horários em um objeto do tipo Lista

    let tzs = TimeZoneInfo.GetSystemTimeZones()

    // Agora percorremos a lista e imprimimos os nomes dos fusos horários

    for tz in tzs do

        printfn "%s" tz.DisplayName

    0
