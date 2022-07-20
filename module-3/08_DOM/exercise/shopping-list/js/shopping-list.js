// add pageTitle
const pageTitle = 'My Shopping List';
// add groceries
const groceries = ['Coffee', 'Half \'n half', 'Oat milk', 'Cereal', 'Bananas', 'Clif Bars', 'Dog Food', 'Cat Food', 'Dish soap', 'Bubbly water']
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const thePageTitle = document.getElementById('title');
  thePageTitle.innerText = pageTitle;
}
/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const shoppingList = document.getElementById('groceries');

  for (let item of groceries) {
    const newListItem = document.createElement('li');
    newListItem.innerText = item;
    shoppingList.insertAdjacentElement('afterbegin', newListItem);
  }
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  for (let item of document.querySelector('#groceries').children) {
    item.classList.add('completed');
  }
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
