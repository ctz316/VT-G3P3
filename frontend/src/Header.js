// Code from Header.js
class Header extends HTMLElement {
  constructor() {
    super();
  }

  connectedCallback() {
    this.innerHTML = `
      <header>
        <h1 class="title">Kid Barker</h1>
        <div id="navbar">
          <li class="dropbtn"><a href="Create page and put path here.html">Home</a></li>
          <li class="dropbtn"><a>Area 1</a>
            <ul class="dropdown-content">
              <li><a href="Create page and put path here.html">Area 2</a></li>
              <li class="dropbtn-sub"><a>Coding I have Done &dArr;</a>
                <ul class="dropdown-content-sub">
                  <li><a href="Create page and put path here.html">Area 3</a></li>
                </ul>
              </li>
            </ul>
          </li>
          <li class="dropbtn"><a>Area 4</a>
            <ul class="dropdown-content">
              <li><a href="Create page and put path here.html">Area 5</a></li>
            </ul>
          </li>
          <li class="dropbtn"><a>Area 6</a>
            <ul class="dropdown-content">
              <li class="dropbtn-sub"><a>Area 7 &dArr;</a>
                <ul class="dropdown-content-sub">
                  <li><a href="Create page and put path here.html">Area 8</a></li>
                </ul>
              </li>
              <li class="dropbtn-sub"><a>Area 9 &dArr;</a>
                <ul class="dropdown-content-sub">
                  <li><a href="Create page and put path here.html">Area 9</a></li>
                </ul>
              </li>
            </ul>
          </li>
          <li class="dropbtn"><a>Area 10</a>
            <ul class="dropdown-content">
              <li><a href="Create page and put path here.html">Area 11</a></li>
              <li class="dropbtn-sub"><a>Area 12 &dArr;</a>
                <ul class="dropdown-content-sub">
                  <li><a href="/My_First_Real_Project/All-About-Me/Header_Pages/Military/Awards_and_Medals/Awards_and_Medals.html">Area 13</a></li>
                </ul>
              </li>
            </ul>
          </li>
          <li class="dropbtn"><a>Area 14</a>
            <ul class="dropdown-content">
              <li><a href="Create page and put path here.html">Area 15</a></li>
            </ul>
          </li>
          <li class="dropbtn"><a>Area 16</a>
            <ul class="dropdown-content">
              <li><a href="Create page and put path here.html">Area 17</a></li>
            </ul>
          </li>
          <li class="dropbtn"><a>Area 18</a>
            <ul class="dropdown-content">
              <li><a href="Create page and put path here.html">Area 19</a></li>
            </ul>
          </li>
          <li class="dropbtn"><a>Area 20</a>
            <ul class="dropdown-content">
              <li><a href="Create page and put path here.html">Area 21</a></li>
            </ul>
          </li>
          <li class="dropbtn"><a>Area 22</a>
            <ul class="dropdown-content">
              <li><a href="Create page and put path here.html">Area 23</a></li>
            </ul>
          </li>
          <li class="dropbtn"><a>Area 24</a>
            <ul class="dropdown-content">
              <li><a href="Create page and put path here.html">Area 25</a></li>
            </ul>
          </li>
        </div>
      </header>

      <style>
        header {
          text-align: center;
        }

        .title {
          font-size: xxx-large;
          text-shadow: 2px 2px 2px darkred;
          text-align: center;
          color: darkgoldenrod;
        }

        /* navbar bar */
        #navbar {
          display: inline-flex;
          padding-bottom: 25px;
          font-size: xxx-large;
          text-shadow: 2px 2px 2px darkred;
          text-align: center;
          color: darkgoldenrod;
        }

        /* Dropdown Button */
        .dropbtn {
          outline: none;
          background: rgba(0, 0, 0, 0.5);
          color: goldenrod;
          font-family: cursive;
          font-size: medium;
          border: thin solid goldenrod;
          padding-right: 5px;
          padding-left: 5px;
          text-shadow: none;
          vertical-align: center;
        }

        /* Dropdown Button */
        .dropbtn-sub {
          outline: none;
          background: rgba(146, 57, 57, 0.5);
          color: goldenrod;
          font-family: cursive;
          padding: 6px 6px 6px 6px;
          font-size: medium;
          border: thin solid goldenrod;
          position: relative;
          text-shadow: none;
          text-align: center;
        }

        /* Dropdown Content (Hidden by Default) */
        .dropdown-content {
          display: none;
          position: absolute;
          background: rgba(0, 0, 0, 0.5);
          padding-bottom: 25px;
          align-items: center;
          z-index: 6;
        }

        /* Links inside the dropdown */
        .dropdown-content a {
          color: gold;
          padding: 12px 16px;
          text-decoration: none;
          display: block;
        }

        /* Dropdown Content (Hidden by Default) */
        .dropdown-content-sub {
          display: none;
          position: absolute;
          background: rgba(0, 0, 0, 0.5);
          padding: 6px;
          text-align: center;
        }

        /* Links inside the dropdown */
        .dropdown-content-sub a {
          color: gold;
          padding: 6px 6px;
          text-decoration: none;
          display: block;
        }

        /* Change the background color of the dropdown button when the dropdown content is shown */
        .dropdown-content:hover .dropbtn {
          background-color: #D21404;
        }

        /* Change color of dropdown links on hover */
        #navbar a:hover {
          background-color: #D21404;
        }

        /* Show the dropdown menu on hover */
        .dropbtn:hover .dropdown-content {
          display: block;
        }

        /* Show the dropdown menu on hover */
        .dropbtn-sub:hover .dropdown-content-sub {
          display: block;
          position: relative;
        }
      </style>
   `;
  }
}

customElements.define('header-component', Header);
