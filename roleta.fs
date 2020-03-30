open System
printf "Digite a quantidade de participantes\n"
let participantes = Convert.ToInt32(Console.ReadLine())
printf "%d participantes\n" participantes


let roleta participantes =
  let mutable continueLooping = true
  let numerorandom = new Random(participantes)
  while continueLooping do
    // Generate a random number between 1 and maxValue.
    let rand = numerorandom.Next(1, participantes+1)
    printf "jogador %d vai beber\n" rand 
    printf "Deseja jogar de novo? 1-sim 2-não\n"
    let jogardenovo = Convert.ToInt32(Console.ReadLine())
    if jogardenovo = 2 then
       printfn "Fim de jogo"
       continueLooping <- false

roleta participantes

Console.ReadKey() |> ignore
