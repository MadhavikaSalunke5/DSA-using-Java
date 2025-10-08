let currentDisplay = "0";
    const display = document.querySelector("#display");
    display.value = currentDisplay;

    function appendValue(val) {
      if (currentDisplay === "0" || currentDisplay === "Error") {
        currentDisplay = val;
      } else {
        currentDisplay += val;
      }
      display.value = currentDisplay;
    }

    function clearDisplay() {
      currentDisplay = "0";
      display.value = currentDisplay;
    }

    function calculate() {
      try {
        currentDisplay = eval(currentDisplay).toString();
      } catch {
        currentDisplay = "Error";
      }
      display.value = currentDisplay;
    }