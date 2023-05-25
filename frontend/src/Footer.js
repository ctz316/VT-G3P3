class Footer extends HTMLElement {
  constructor() {
    super();
  }

  connectedCallback() {
    this.innerHTML = `
<footer>
    <div class="footer-insert">
        <ul class="footer-content">
            <li><a href="CREATE FILE PATH.html">Nick</a></li>
            <li><a href="CREATE FILE PATH.html">Kyle</a></li>
            <li><a href="CREATE FILE PATH.html">Kid</a></li>
        </ul>
    </div>
</footer>

<style>
footer {
    width: 100%;
    margin-top: auto;
}

.footer-insert {
    font-size: x-large;
    text-align: center;
    color: darkgoldenrod;
    font-family: cursive;
    border: thin solid goldenrod;
}

.footer-content {
    display: flex;
    justify-content: space-evenly;
    padding: 15px 15px 15px 15px;
}

a {
    text-decoration: none;
    text-shadow: 2px 2px 2px darkred;
    color: darkgoldenrod;
}
</style>
`;
  }
}

customElements.define('footer-component', Footer);
