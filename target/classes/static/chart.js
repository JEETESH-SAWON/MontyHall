document.addEventListener("DOMContentLoaded",() => {

    const el = document.getElementById("chart-container");
    if(!el) return;

    const xValues = ["InitialChoice", "SwitchedChoice"];
    const yValues = JSON.parse(el.dataset.chart);
    const barColors = ["red", "green"];

    const myChart = document.getElementById('myChart').getContext('2d');

    new Chart(myChart, {
        type: "bar",
        data: {
            labels: xValues,
            datasets: [{
                backgroundColor: barColors,
                data: yValues,
                barThickness: 10,
                maxBarThickness: 12,
                barPercentage: 0.5,
                minBarLength: 2,
            }]
        },
        options: {
            plugins:{
                legend: {display: false},
                title: {
                    display: true,
                    text: "Monty Hall Simulation"
                }
            }

        }
    });
})


